package com.ds2;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    FileModel storeFile(MultipartFile file);
    FileModel getFile(String fileId);

}
