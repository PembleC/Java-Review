@Entity
@Table(name="customer")
@GenericGenerator(name="generatorName", strategy = "increment");
public class CustomerEntity {
  @Id
  @GeneratedValue(generator="generatorName")
  private Integer customerId;
  private String customerName;
  //getters and setters
}
