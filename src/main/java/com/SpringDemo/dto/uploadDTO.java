package com.SpringDemo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class uploadDTO{
    private String name;
        private String base64;
        private String filename;
        private String filetype;

    public uploadDTO(String name, String base64, String filename, String filetype) {
        this.name = name;
        this.base64 = base64;
        this.filename = filename;
        this.filetype = filetype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    @Override
    public String toString() {
        return "uploadDTO{" +
                "name='" + name + '\'' +
                ", base64='" + base64 + '\'' +
                ", filename='" + filename + '\'' +
                ", filetype='" + filetype + '\'' +
                '}';
    }
}
