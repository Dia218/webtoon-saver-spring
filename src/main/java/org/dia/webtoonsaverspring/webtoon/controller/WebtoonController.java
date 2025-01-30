package org.dia.webtoonsaverspring.webtoon.controller;

import org.dia.webtoonsaverspring.webtoon.service.WebtoonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WebtoonController {
	private final WebtoonService webtoonService;

	@GetMapping("/fetch-webtoons")
	public void fetchWebtoons() {
		webtoonService.saveWebtoons();
	}
}
