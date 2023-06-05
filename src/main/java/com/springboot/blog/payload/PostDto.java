package com.springboot.blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

	private long id;
	
	@NotEmpty
	@Size(min=2, message="Post title should have atleast two characters")
	private String title;
	
	@NotEmpty
	@Size(min=10, message="Description should have atleast ten characters")
	private String description;
	
	@NotEmpty
	private String content;

}
