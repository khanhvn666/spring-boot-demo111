package com.briscloud.pj.first.name.demo111.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageLocationResponse {
    private String imageId;
    private String imageLocation;

}
