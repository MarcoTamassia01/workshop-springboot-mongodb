package com.marco.workshopmongo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.marco.workshopmongo.dto.AuthorDTO;
import com.marco.workshopmongo.dto.CommentDTO;

@Document
public class Post  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private Date date;
	private String tittle;
	private String body;
	private AuthorDTO  author;
	
	private List<CommentDTO> comments = new ArrayList<>();
	
	
	public Post() {
		
	}

	public Post(String id, Date date, String tittle, String body, AuthorDTO author) {
		super();
		this.id = id;
		this.date = date;
		this.tittle = tittle;
		this.body = body;
		this.author=author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	public List<CommentDTO> getComments() {
		return comments;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

}
