package br.com.maven.springmvc.domain;

import java.util.Date;

/**
 * Created by felipe on 06/11/15.
 */
public class UploadFile {


    /**
     * Código do arquivo de upload.
     */
    private Long id;

    /**
     * Identificador universal único do arquivo de upload.
     */
    private String uuid;

    /**
     * Identificador do arquivo técnico dentro do contexto do repositório.
     */
    private String technicalFileObjectId;

    /**
     * Identificador do arquivo de negócio dentro do contexto do repositório.
     */
    private String businessFileObjectId;

    private Date createdAt;

    /**
     * Construtor Default.
     */
    public UploadFile(final String uuid) {
        this.uuid = uuid;
        createdAt = new Date();

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTechnicalFileObjectId() {
        return technicalFileObjectId;
    }

    public void setTechnicalFileObjectId(String technicalFileObjectId) {
        this.technicalFileObjectId = technicalFileObjectId;
    }

    public String getBusinessFileObjectId() {
        return businessFileObjectId;
    }

    public void setBusinessFileObjectId(String businessFileObjectId) {
        this.businessFileObjectId = businessFileObjectId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
