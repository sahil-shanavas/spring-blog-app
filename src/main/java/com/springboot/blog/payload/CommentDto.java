package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {

	private long id;
	
	@NotBlank(message = "Name should not be null or empty")
	private String name;
	
	@NotBlank(message = "Email should not be null or empty")
	@Email
	private String email;
	
	@NotBlank(message = "Comment should not be null or empty")
	@Size(min = 10, message="Comment should have minimum 10 characters")
	private String body;
	
}
