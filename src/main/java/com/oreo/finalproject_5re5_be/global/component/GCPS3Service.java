package com.oreo.finalproject_5re5_be.global.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Component
@Slf4j
public class GCPS3Service implements StorageService{
    @Override
    public String upload(MultipartFile file, String dirName) {
        return null;
    }

    @Override
    public File downloadFile(String key) throws IOException {
        return null;
    }

    @Override
    public void deleteFile(String buketName, String key) {

    }
}
