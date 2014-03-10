/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DONORS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donors.findAll", query = "SELECT d FROM Donors d"),
    @NamedQuery(name = "Donors.findByDonorid", query = "SELECT d FROM Donors d WHERE d.donorid = :donorid"),
    @NamedQuery(name = "Donors.findByDonoraddressline1", query = "SELECT d FROM Donors d WHERE d.donoraddressline1 = :donoraddressline1"),
    @NamedQuery(name = "Donors.findByDonoraddressline2", query = "SELECT d FROM Donors d WHERE d.donoraddressline2 = :donoraddressline2"),
    @NamedQuery(name = "Donors.findByDonorcountry", query = "SELECT d FROM Donors d WHERE d.donorcountry = :donorcountry"),
    @NamedQuery(name = "Donors.findByDonorcounty", query = "SELECT d FROM Donors d WHERE d.donorcounty = :donorcounty"),
    @NamedQuery(name = "Donors.findByDonoremail", query = "SELECT d FROM Donors d WHERE d.donoremail = :donoremail"),
    @NamedQuery(name = "Donors.findByDonorfirstname", query = "SELECT d FROM Donors d WHERE d.donorfirstname = :donorfirstname"),
    @NamedQuery(name = "Donors.findByDonorlandline", query = "SELECT d FROM Donors d WHERE d.donorlandline = :donorlandline"),
    @NamedQuery(name = "Donors.findByDonorlastname", query = "SELECT d FROM Donors d WHERE d.donorlastname = :donorlastname"),
    @NamedQuery(name = "Donors.findByDonormobile", query = "SELECT d FROM Donors d WHERE d.donormobile = :donormobile"),
    @NamedQuery(name = "Donors.findByDonorpostcode", query = "SELECT d FROM Donors d WHERE d.donorpostcode = :donorpostcode"),
    @NamedQuery(name = "Donors.findByDonortown", query = "SELECT d FROM Donors d WHERE d.donortown = :donortown")})
public class Donors implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DONORID")
    private BigDecimal donorid;
    @Column(name = "DONORADDRESSLINE1")
    private String donoraddressline1;
    @Column(name = "DONORADDRESSLINE2")
    private String donoraddressline2;
    @Column(name = "DONORCOUNTRY")
    private String donorcountry;
    @Column(name = "DONORCOUNTY")
    private String donorcounty;
    @Column(name = "DONOREMAIL")
    private String donoremail;
    @Column(name = "DONORFIRSTNAME")
    private String donorfirstname;
    @Column(name = "DONORLANDLINE")
    private String donorlandline;
    @Column(name = "DONORLASTNAME")
    private String donorlastname;
    @Column(name = "DONORMOBILE")
    private String donormobile;
    @Column(name = "DONORPOSTCODE")
    private String donorpostcode;
    @Column(name = "DONORTOWN")
    private String donortown;
    @OneToMany(mappedBy = "donorid")
    private Collection<Donations> donationsCollection;

    public Donors() {
    }

    public Donors(BigDecimal donorid) {
        this.donorid = donorid;
    }

    public BigDecimal getDonorid() {
        return donorid;
    }

    public void setDonorid(BigDecimal donorid) {
        this.donorid = donorid;
    }

    public String getDonoraddressline1() {
        return donoraddressline1;
    }

    public void setDonoraddressline1(String donoraddressline1) {
        this.donoraddressline1 = donoraddressline1;
    }

    public String getDonoraddressline2() {
        return donoraddressline2;
    }

    public void setDonoraddressline2(String donoraddressline2) {
        this.donoraddressline2 = donoraddressline2;
    }

    public String getDonorcountry() {
        return donorcountry;
    }

    public void setDonorcountry(String donorcountry) {
        this.donorcountry = donorcountry;
    }

    public String getDonorcounty() {
        return donorcounty;
    }

    public void setDonorcounty(String donorcounty) {
        this.donorcounty = donorcounty;
    }

    public String getDonoremail() {
        return donoremail;
    }

    public void setDonoremail(String donoremail) {
        this.donoremail = donoremail;
    }

    public String getDonorfirstname() {
        return donorfirstname;
    }

    public void setDonorfirstname(String donorfirstname) {
        this.donorfirstname = donorfirstname;
    }

    public String getDonorlandline() {
        return donorlandline;
    }

    public void setDonorlandline(String donorlandline) {
        this.donorlandline = donorlandline;
    }

    public String getDonorlastname() {
        return donorlastname;
    }

    public void setDonorlastname(String donorlastname) {
        this.donorlastname = donorlastname;
    }

    public String getDonormobile() {
        return donormobile;
    }

    public void setDonormobile(String donormobile) {
        this.donormobile = donormobile;
    }

    public String getDonorpostcode() {
        return donorpostcode;
    }

    public void setDonorpostcode(String donorpostcode) {
        this.donorpostcode = donorpostcode;
    }

    public String getDonortown() {
        return donortown;
    }

    public void setDonortown(String donortown) {
        this.donortown = donortown;
    }

    @XmlTransient
    public Collection<Donations> getDonationsCollection() {
        return donationsCollection;
    }

    public void setDonationsCollection(Collection<Donations> donationsCollection) {
        this.donationsCollection = donationsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donorid != null ? donorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donors)) {
            return false;
        }
        Donors other = (Donors) object;
        if ((this.donorid == null && other.donorid != null) || (this.donorid != null && !this.donorid.equals(other.donorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseEntityClasses.Donors[ donorid=" + donorid + " ]";
    }
    
}
