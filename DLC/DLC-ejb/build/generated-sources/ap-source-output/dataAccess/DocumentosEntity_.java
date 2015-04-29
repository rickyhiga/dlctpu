package dataAccess;

import dataAccess.PosteoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-28T23:17:42")
@StaticMetamodel(DocumentosEntity.class)
public class DocumentosEntity_ { 

    public static volatile SingularAttribute<DocumentosEntity, Float> moduloDoc;
    public static volatile SingularAttribute<DocumentosEntity, Integer> id;
    public static volatile SingularAttribute<DocumentosEntity, String> nombre;
    public static volatile SingularAttribute<DocumentosEntity, String> url;
    public static volatile CollectionAttribute<DocumentosEntity, PosteoEntity> posteoEntityCollection;

}