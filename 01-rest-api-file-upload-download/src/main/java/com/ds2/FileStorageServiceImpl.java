package com.ds2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;

    @Override
    public FileModel storeFile(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! your file contails invalid characters...");
            }

            FileModel fileModel =FileModel.builder()
                    .fileName(fileName)
                    .fileType(file.getContentType())
                    .data(file.getBytes())
                    .build();

            return dbFileRepository.save(fileModel);

        } catch (IOException ioe) {
            throw new FileStorageException("could not store file " + fileName + " Please try again, " + ioe);
        }

    }

    @Override
    public FileModel getFile(String fileId) {

        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }

}