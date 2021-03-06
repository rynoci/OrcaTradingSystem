package orca.entitybeans.jpa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STOCKSOWNED")
public class StocksOwned implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer portfolioId;
    private String stocksCode;
    private Integer sharesOwned;
    private Portfolio portfolio;
    
    public StocksOwned() {
    	
    }
    
    public void setId(Integer id) {
    	this.id = id;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    public Integer getId() {
        return id;
    }
    
    public void setPortfolioId(Integer portfolioId) {
    	this.portfolioId = portfolioId;
    }
    
    @Column(name="Portfolio_id")
    public Integer getPortfolioId() {
    	return portfolioId;
    }
    
    public void setStocksCode(String stocksCode) {
    	this.stocksCode = stocksCode;
    }
    
    @Column(name="Stocks_code")
    public String getStocksCode() {
    	return stocksCode;
    }
    
    public void setSharesOwned(Integer sharesOwned) {
    	this.sharesOwned = sharesOwned;
    }
    
    @Column(name="Shares_owned")
    public Integer getSharesOwned() {
    	return sharesOwned;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
    
    @ManyToOne
    public Portfolio getPortfolio() {
        return portfolio;
    }
    
}
