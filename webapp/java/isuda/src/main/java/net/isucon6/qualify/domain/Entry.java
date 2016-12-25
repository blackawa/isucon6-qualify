package net.isucon6.qualify.domain;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
    private Long id;
    private Long authorId;
    private String keyword;
    private String description;
    private Date updatedAt;
    private Date createdAt;
    private List<Star> stars;
}
