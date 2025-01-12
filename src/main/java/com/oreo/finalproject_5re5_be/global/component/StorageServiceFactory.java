package com.oreo.finalproject_5re5_be.global.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StorageServiceFactory {
    private final AWSS3Service awss3Service;
    private final GCPS3Service gcps3Service;

    @Value("${select.s3.mode}")
    private String select;

    @Autowired
    public StorageServiceFactory(AWSS3Service awss3Service, GCPS3Service gcps3Service) {
        this.awss3Service = awss3Service;
        this.gcps3Service = gcps3Service;
    }

    //StorageService storageService = storageServiceFactory.getStorageService(provider);
    //String url = storageService.uploadFile(filePath, file.getBytes());
    public StorageService getStorageService(){
        if(select.toLowerCase()=="aws"){
            return awss3Service;
        }
        if(select.toLowerCase()=="gcp"){
            return gcps3Service;
        }
        throw new IllegalArgumentException("aws, gcp가 아닌 다른 문자가 들어왔습니다 : "+ select);
    }
}
