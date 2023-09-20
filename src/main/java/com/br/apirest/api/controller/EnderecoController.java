import java.util.List;

import main.java.com.br.apirest.repository.EnderecoRepository;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository eRepository;


    //listar
    @GetMapping("/lista")
    public List<Endereco> getObject(){
        List<Endereco> enderecos = new ArrayList<>();
        enderecos = (List<Endereco>) eRepository.findAll();

        return enderecos;
    }

    @PostMapping("/cadastro")
    public Endreco endereco(Endereco endereco){
        eRepository.save(endereco);
        return endereco;
    }

    
}
