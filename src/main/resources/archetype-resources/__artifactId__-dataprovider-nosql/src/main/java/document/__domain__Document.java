package ${package}.document;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Document("${domain.toLowerCase()}")
public class ${domain}Document extends AbstractDocument {

    @Id
    @Field("_id")
    private ObjectId dbId;

    private String id;
    // ...

}