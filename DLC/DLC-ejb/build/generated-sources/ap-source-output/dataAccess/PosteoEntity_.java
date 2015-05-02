package dataAccess;

import dataAccess.DocumentosEntity;
import dataAccess.VocabularioEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-02T12:41:59")
@StaticMetamodel(PosteoEntity.class)
public class PosteoEntity_ { 

    public static volatile SingularAttribute<PosteoEntity, Integer> id;
    public static volatile SingularAttribute<PosteoEntity, Integer> cantAparicionesTf;
    public static volatile SingularAttribute<PosteoEntity, DocumentosEntity> documentoId;
    public static volatile SingularAttribute<PosteoEntity, VocabularioEntity> vocabularioId;

}