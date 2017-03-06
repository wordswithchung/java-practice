package com.company;
/* This app will search for files on command line
 * and put all matching files into a zip file.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileSearchApp {
    String path;
    String regex;
    String zipFileName;
    Pattern pattern;
    List<File> zipFiles = new ArrayList<File>();

    public static void main(String[] args) {
        FileSearchApp app = new FileSearchApp();

        switch (Math.min(args.length, 3)) {
            case 0:
                System.out.println("USAGE: FileSearchApp path [regex] [zipfile]");
                return;
            case 3: app.setZipFileName(args[2]);
            case 2: app.setRegex(args[1]);
            case 1: app.setPath(args[0]);
        }

        try {
            app.walkDirectory(app.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void walkDirectory(String path) throws IOException {
        Files.walk(Paths.get(path)).forEach(f -> processFile(f.toFile()));
        zipFiles();
    }

    public boolean searchFile(File file) throws IOException {
        // anyMatch will short circuit and stop and return true as soon as match is found
        return Files.lines(file.toPath()).anyMatch(t -> searchText(t));
    }

    public boolean searchText(String text) {
        if (this.getRegex() == null) {
            return true;
        } else {
            return this.pattern.matcher(text).find();
        }
        /* One-line version of this code:
         * return (this.getRegex() == null) ? true : text.toLowerCase().contains(this.getRegex().toLowerCase());
         */
    }

    public void addFileToZip(File file) {
        if (getZipFileName() != null) {
            zipFiles.add(file);
        }
    }

    public void zipFiles() throws IOException {
        try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(getZipFileName()))) {
            File baseDir = new File(getPath());

            for (File file : zipFiles) {
                // fileName must be a relative path, not an absolute one
                String fileName = getRelativeFilename(file, baseDir);

                ZipEntry zipEntry = new ZipEntry(fileName);
                zipEntry.setTime(file.lastModified());
                out.putNextEntry(zipEntry);

                Files.copy(file.toPath(), out);

                out.closeEntry();
            }
        }
    }

    public String getRelativeFilename(File file, File baseDir) {
        String fileName = file.getAbsolutePath().substring(baseDir.getAbsolutePath().length());

        // IMPORTANT: the ZipEntry file name must use "/", not "\"
        fileName = fileName.replace('\\', '/');

        while (fileName.startsWith("/")) {
            fileName = fileName.substring(1);
        }

        return fileName;
    }

    public void processFile(File file) {
        try {
            if (searchFile(file)) {
                addFileToZip(file);
            }
        } catch (IOException|UncheckedIOException e) {
            System.out.println("Error processing file: " + file + ": " + e);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
        this.pattern = Pattern.compile(regex);
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }

}
