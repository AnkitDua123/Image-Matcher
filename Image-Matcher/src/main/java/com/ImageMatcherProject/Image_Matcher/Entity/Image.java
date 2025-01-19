package com.ImageMatcherProject.Image_Matcher.Entity;
import java.util.Base64;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Image {
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getCategory() {
        return category;
    }

    public String getKeywords() {
        return keywords;
    }

    public byte[] getImageData() {
        return imageData;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;

    private String keywords;

    @Lob
    private byte[] imageData;

    public String getBase64Image() {
        return Base64.getEncoder().encodeToString(imageData);
    }
}