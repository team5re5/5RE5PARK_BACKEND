package com.oreo.finalproject_5re5_be.global.component;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public interface StorageService {
    String upload(MultipartFile file, String dirName);
    File downloadFile(String key) throws IOException;
    void deleteFile(String bucketName, String key);
}
