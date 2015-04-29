/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "vocabulario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VocabularioEntity.findAll", query = "SELECT v FROM VocabularioEntity v"),
    @NamedQuery(name = "VocabularioEntity.findById", query = "SELECT v FROM VocabularioEntity v WHERE v.id = :id"),
    @NamedQuery(name = "VocabularioEntity.findByTermino", query = "SELECT v FROM VocabularioEntity v WHERE v.termino = :termino"),
    @NamedQuery(name = "VocabularioEntity.findByCantDoc", query = "SELECT v FROM VocabularioEntity v WHERE v.cantDoc = :cantDoc"),
    @NamedQuery(name = "VocabularioEntity.findByMaxTf", query = "SELECT v FROM VocabularioEntity v WHERE v.maxTf = :maxTf")})
public class VocabularioEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 30)
    @Column(name = "termino")
    private String termino;
    @Column(name = "cant_doc")
    private Integer cantDoc;
    @Column(name = "max_tf")
    private Integer maxTf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vocabularioId")
    private Collection<PosteoEntity> posteoEntityCollection;

    public VocabularioEntity() {
    }

    public VocabularioEntity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public Integer getCantDoc() {
        return cantDoc;
    }

    public void setCantDoc(Integer cantDoc) {
        this.cantDoc = cantDoc;
    }

    public Integer getMaxTf() {
        return maxTf;
    }

    public void setMaxTf(Integer maxTf) {
        this.maxTf = maxTf;
    }

    @XmlTransient
    public Collection<PosteoEntity> getPosteoEntityCollection() {
        return posteoEntityCollection;
    }

    public void setPosteoEntityCollection(Collection<PosteoEntity> posteoEntityCollection) {
        this.posteoEntityCollection = posteoEntityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VocabularioEntity)) {
            return false;
        }
        VocabularioEntity other = (VocabularioEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dataAccess.VocabularioEntity[ id=" + id + " ]";
    }
    
}
