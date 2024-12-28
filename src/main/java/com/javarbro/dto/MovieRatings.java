package com.javarbro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieRatings {
    private Long id;
    private String userId;
    private Long movieId;
    private Integer rating;
}
