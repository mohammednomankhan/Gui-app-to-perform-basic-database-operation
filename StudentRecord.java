/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Nauman
 */
@Entity
@Table(name = "student_record", catalog = "mydata", schema = "")
@NamedQueries({
    @NamedQuery(name = "StudentRecord.findAll", query = "SELECT s FROM StudentRecord s")
    , @NamedQuery(name = "StudentRecord.findBySname", query = "SELECT s FROM StudentRecord s WHERE s.sname = :sname")
    , @NamedQuery(name = "StudentRecord.findByFname", query = "SELECT s FROM StudentRecord s WHERE s.fname = :fname")
    , @NamedQuery(name = "StudentRecord.findByRollnum", query = "SELECT s FROM StudentRecord s WHERE s.rollnum = :rollnum")
    , @NamedQuery(name = "StudentRecord.findByDob", query = "SELECT s FROM StudentRecord s WHERE s.dob = :dob")
    , @NamedQuery(name = "StudentRecord.findByFmobile", query = "SELECT s FROM StudentRecord s WHERE s.fmobile = :fmobile")
    , @NamedQuery(name = "StudentRecord.findByEmail", query = "SELECT s FROM StudentRecord s WHERE s.email = :email")})
public class StudentRecord implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "sname")
    private String sname;
    @Basic(optional = false)
    @Column(name = "fname")
    private String fname;
    @Id
    @Basic(optional = false)
    @Column(name = "rollnum")
    private String rollnum;
    @Basic(optional = false)
    @Column(name = "dob")
    private String dob;
    @Basic(optional = false)
    @Column(name = "fmobile")
    private String fmobile;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public StudentRecord() {
    }

    public StudentRecord(String rollnum) {
        this.rollnum = rollnum;
    }

    public StudentRecord(String rollnum, String sname, String fname, String dob, String fmobile, String email) {
        this.rollnum = rollnum;
        this.sname = sname;
        this.fname = fname;
        this.dob = dob;
        this.fmobile = fmobile;
        this.email = email;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        String oldSname = this.sname;
        this.sname = sname;
        changeSupport.firePropertyChange("sname", oldSname, sname);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getRollnum() {
        return rollnum;
    }

    public void setRollnum(String rollnum) {
        String oldRollnum = this.rollnum;
        this.rollnum = rollnum;
        changeSupport.firePropertyChange("rollnum", oldRollnum, rollnum);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getFmobile() {
        return fmobile;
    }

    public void setFmobile(String fmobile) {
        String oldFmobile = this.fmobile;
        this.fmobile = fmobile;
        changeSupport.firePropertyChange("fmobile", oldFmobile, fmobile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollnum != null ? rollnum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentRecord)) {
            return false;
        }
        StudentRecord other = (StudentRecord) object;
        if ((this.rollnum == null && other.rollnum != null) || (this.rollnum != null && !this.rollnum.equals(other.rollnum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student.StudentRecord[ rollnum=" + rollnum + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
