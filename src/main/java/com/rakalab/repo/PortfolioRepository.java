package com.rakalab.repo;

import com.rakalab.model.Portfolio;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PortfolioRepository {
    private Map<Integer, Portfolio> portfolioMap = new HashMap<>();

    public void save(Portfolio portfolio) {
        if (portfolioMap.containsKey(portfolio.getId())) {
            throw new RuntimeException("Portfolio with id " + portfolio.getId() + " already exists.");
        }

        portfolioMap.put(portfolio.getId(), portfolio);
    }

    public Portfolio get(Integer id) {
        return portfolioMap.get(id);
    }

    public void delete(Integer id) {
        if (portfolioMap.remove(id) == null) {
            throw new RuntimeException("Portfolio with id " + id + " does not exists.");
        }
    }
}
