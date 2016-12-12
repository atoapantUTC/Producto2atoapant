package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Platose extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String categoria;
    
    @Constraints.Required
    public String costo;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date introduced;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date discontinued;
    

   public static Find<Long,Platose> find = new Find<Long,Platose>(){};
	public static List<Platose> listadoComputadores() {
		// TODO Auto-generated method stub
		return find.all();
	}
    
}

