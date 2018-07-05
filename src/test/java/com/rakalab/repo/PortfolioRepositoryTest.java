package com.rakalab.repo;

import com.rakalab.model.Portfolio;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PortfolioRepositoryTest {

    PortfolioRepository portfolioRepository = new PortfolioRepository();

    @Test
    public void shouldSavePortfolio() {
        portfolioRepository.save(
                Portfolio.builder()
                        .id(1)
                        .name("portfolio-1")
                        .build()
        );

        Assertions.assertThat(portfolioRepository.get(1))
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "portfolio-1");
    }

    @Test
    public void shouldDeletePortfolio() {
        portfolioRepository.save(
                Portfolio.builder()
                        .id(1)
                        .name("portfolio-1")
                        .build()
        );

        Assertions.assertThat(portfolioRepository.get(1))
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "portfolio-1");

        portfolioRepository.delete(1);

        Assertions.assertThat(portfolioRepository.get(1))
                .isNull();
    }
}
