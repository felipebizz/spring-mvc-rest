package br.com.maven.springmvc.controller;

import br.com.maven.springmvc.domain.UploadFile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by felipe on 06/11/15.
 */
@RestController
public class IngestionController {


    @RequestMapping("/ingestion/{uuid}")
    public UploadFile updateMetadata(@PathVariable String uuid) {

        UploadFile uploadFile = new UploadFile(uuid);
        return uploadFile;
    }


}
