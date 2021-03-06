/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gdodd
 */
@Entity
@Table(name = "STOCKITEMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stockitems.findAll", query = "SELECT s FROM Stockitems s"),
    @NamedQuery(name = "Stockitems.findBySku", query = "SELECT s FROM Stockitems s WHERE s.sku = :sku"),
    @NamedQuery(name = "Stockitems.findByDescription", query = "SELECT s FROM Stockitems s WHERE s.description = :description"),
    @NamedQuery(name = "Stockitems.findByName", query = "SELECT s FROM Stockitems s WHERE s.name = :name"),
    @NamedQuery(name = "Stockitems.findByPrice", query = "SELECT s FROM Stockitems s WHERE s.price = :price"),
    @NamedQuery(name = "Stockitems.findByQuantity", query = "SELECT s FROM Stockitems s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "Stockitems.findByType", query = "SELECT s FROM Stockitems s WHERE s.type = :type"),
    @NamedQuery(name = "Stockitems.findByWeight", query = "SELECT s FROM Stockitems s WHERE s.weight = :weight")})
public class Stockitems implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SKU")
    private BigDecimal sku;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private BigInteger price;
    @Column(name = "QUANTITY")
    private BigInteger quantity;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "WEIGHT")
    private BigInteger weight;
    @OneToMany(mappedBy = "sku")
    private Collection<Ordereditems> ordereditemsCollection;
    @JoinColumn(name = "SUPPLIERID", referencedColumnName = "SUPPLIERID")
    @ManyToOne
    private Suppliers supplierid;

    public Stockitems() {
    }

    public Stockitems(BigDecimal sku) {
        this.sku = sku;
    }

    public BigDecimal getSku() {
        return sku;
    }

    public void setSku(BigDecimal sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    @XmlTransient
    public Collection<Ordereditems> getOrdereditemsCollection() {
        return ordereditemsCollection;
    }

    public void setOrdereditemsCollection(Collection<Ordereditems> ordereditemsCollection) {
        this.ordereditemsCollection = ordereditemsCollection;
    }

    public Suppliers getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Suppliers supplierid) {
        this.supplierid = supplierid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sku != null ? sku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stockitems)) {
            return false;
        }
        Stockitems other = (Stockitems) object;
        if ((this.sku == null && other.sku != null) || (this.sku != null && !this.sku.equals(other.sku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseEntityClasses.Stockitems[ sku=" + sku + " ]";
    }
    
}
