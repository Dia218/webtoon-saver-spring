package org.dia.webtoonsaverspring.webtoon.mapper;

import java.util.List;

import org.dia.webtoonsaverspring.webtoon.api.WebtoonApiResponse;
import org.dia.webtoonsaverspring.webtoon.entity.Webtoon;
import org.dia.webtoonsaverspring.webtoon.enumerate.Platform;

public class WebtoonApiResponseMapper {
	public static Webtoon toEntity(WebtoonApiResponse webtoonApiResponse) {
		return Webtoon.builder()
			.webtoonName(webtoonApiResponse.getTitle())
			.platform(Platform.fromString(webtoonApiResponse.getProvider()))
			.webtoonLink(webtoonApiResponse.getUrl())
			.thumbnailUrl(webtoonApiResponse.getThumbnails().isEmpty() ? null :
				webtoonApiResponse.getThumbnails().getFirst())
			.authors(formatAuthors(webtoonApiResponse.getAuthors()))
			.finished(webtoonApiResponse.isEnd())
			.build();
	}

	private static String formatAuthors(List<String> authors) {
		return authors == null ? "" : String.join(", ", authors);
	}
}
