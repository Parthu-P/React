
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

 @Query(value="select name, salary from Customer where id =: value")
 public Customer getEmp(@Param(value) Integer id);
}

public interface Service{
 public Customer insert(CustomerForm form);
}

@Service
public class CustomerService implements Srvice{

 @Autowired 
 private CustomerRepo repo;

 public Customer insert(CustomerForm form){
   
  Customer entity = new Customer();
  BeanUtils.copyProperties(form,entity);
  return repo.save(entity);
 }
} 
@RestControler
public class RestCustomer{
  
  @Autowired
  private CustomerService service;

  @PostMapping("insert")
  public ResponseEntity<Customer> insertCust(@RequestBody Customer entity){
     Customer customer=new Customer();
     Customer customerEntity=service.insert(customer);
    return new ResponseEntity<>(customerEntity, HttpStatus.created);
  }
}