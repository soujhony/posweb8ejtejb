package controle;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import modelo.Produto;

@WebService
public class ProdutosUC{

	@PersistenceContext
	private EntityManager em;

	@WebMethod
	public List<Produto> listar() {
		return em.createQuery("from " + Produto.class.getName()).getResultList();
	}

}
