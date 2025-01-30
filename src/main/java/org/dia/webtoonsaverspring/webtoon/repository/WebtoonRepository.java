package org.dia.webtoonsaverspring.webtoon.repository;

import org.dia.webtoonsaverspring.webtoon.entity.Webtoon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebtoonRepository extends JpaRepository<Webtoon, Long> {
}
