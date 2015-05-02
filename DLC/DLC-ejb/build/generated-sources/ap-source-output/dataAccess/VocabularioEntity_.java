package dataAccess;

import dataAccess.PosteoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-02T12:41:59")
@StaticMetamodel(VocabularioEntity.class)
public class VocabularioEntity_ { 

    public static volatile SingularAttribute<VocabularioEntity, Integer> cantDoc;
    public static volatile SingularAttribute<VocabularioEntity, Integer> id;
    public static volatile SingularAttribute<VocabularioEntity, String> termino;
    public static volatile SingularAttribute<VocabularioEntity, Integer> maxTf;
    public static volatile CollectionAttribute<VocabularioEntity, PosteoEntity> posteoEntityCollection;

}