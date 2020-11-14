/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Philip
 */
@Entity
@SequenceGenerator(name="opaccountseq", sequenceName = "opaccount_seq", initialValue = 1,allocationSize = 1)
public class OperatorAccount extends Account {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="opaccountseq")
    private long id;
    
    @OneToOne
    private Operator operator;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
    
}
