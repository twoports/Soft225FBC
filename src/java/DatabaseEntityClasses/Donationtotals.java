/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gdodd
 */
@Entity
@Table(name = "DONATIONTOTALS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donationtotals.findAll", query = "SELECT d FROM Donationtotals d"),
    @NamedQuery(name = "Donationtotals.findByDonorfundid", query = "SELECT d FROM Donationtotals d WHERE d.donorfundid = :donorfundid"),
    @NamedQuery(name = "Donationtotals.findByClubid", query = "SELECT d FROM Donationtotals d WHERE d.clubid = :clubid"),
    @NamedQuery(name = "Donationtotals.findByFundstotal", query = "SELECT d FROM Donationtotals d WHERE d.fundstotal = :fundstotal"),
    @NamedQuery(name = "Donationtotals.findByLasdonationdate", query = "SELECT d FROM Donationtotals d WHERE d.lasdonationdate = :lasdonationdate")})
public class Donationtotals implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DONORFUNDID")
    private BigDecimal donorfundid;
    @Column(name = "CLUBID")
    private BigInteger clubid;
    @Column(name = "FUNDSTOTAL")
    private BigDecimal fundstotal;
    @Column(name = "LASDONATIONDATE")
    private String lasdonationdate;

    public Donationtotals() {
    }

    public Donationtotals(BigDecimal donorfundid) {
        this.donorfundid = donorfundid;
    }

    public BigDecimal getDonorfundid() {
        return donorfundid;
    }

    public void setDonorfundid(BigDecimal donorfundid) {
        this.donorfundid = donorfundid;
    }

    public BigInteger getClubid() {
        return clubid;
    }

    public void setClubid(BigInteger clubid) {
        this.clubid = clubid;
    }

    public BigDecimal getFundstotal() {
        return fundstotal;
    }

    public void setFundstotal(BigDecimal fundstotal) {
        this.fundstotal = fundstotal;
    }

    public String getLasdonationdate() {
        return lasdonationdate;
    }

    public void setLasdonationdate(String lasdonationdate) {
        this.lasdonationdate = lasdonationdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donorfundid != null ? donorfundid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donationtotals)) {
            return false;
        }
        Donationtotals other = (Donationtotals) object;
        if ((this.donorfundid == null && other.donorfundid != null) || (this.donorfundid != null && !this.donorfundid.equals(other.donorfundid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseEntityClasses.Donationtotals[ donorfundid=" + donorfundid + " ]";
    }
    
}
