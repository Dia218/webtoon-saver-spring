package org.dia.webtoonsaverspring.webtoon.entity;

import org.dia.webtoonsaverspring.webtoon.enumerate.Platform;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Webtoon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long webtoonId;

	private String webtoonName;

	@Enumerated(EnumType.STRING)
	private Platform platform;

	private String webtoonLink;

	private String thumbnailUrl;

	private String authors;

	private boolean finished;

}
