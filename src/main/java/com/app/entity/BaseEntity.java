package com.app.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	
	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime creatdAt;
	
	@CreatedBy
	@Column(updatable =false)
	private String createdBy;
	
	@LastModifiedDate
	@Column(insertable=false)
	private LocalDateTime updatedAt;
	
	@LastModifiedBy
	@Column(insertable=false)
	private String updatedBy;
	
	

}
