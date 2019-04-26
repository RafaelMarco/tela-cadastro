import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Cadastro extends JFrame implements ActionListener{
    private JTextField Nome,Telefone,Telefone2,Telefone3,Endereco,Cpf,Rg,Email,
            Numero,Complemento,Cidade,Bairro,Cep,Data_nascimento;
    private JButton cadas,consul,limpa;
    private JLabel nome,endere,tele,tele1,tele2,Cadastro_de,cpf,email,rg,numb,
            comple,cid,bair,cp,dt_nasc;
    private JComboBox city;
    public Pessoa pa[]=new Pessoa[10];
    Scanner s = new Scanner(System.in);
    private String n1,n2,n3;
    int contador=0;
    public Cadastro(){
   		//
        super("Cadastro de Clintes");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        
        

	cadas=new JButton("Cadastro");
	consul=new JButton("Consulta");
	limpa=new JButton("Limpar");
	
	//RÃ³tulos

	nome=new JLabel("Nome");
	endere=new JLabel("Endereço");
	tele=new JLabel("Fone Com:");
	tele1=new JLabel("Fone Res:");
	tele2=new JLabel("Celular");
	Cadastro_de=new JLabel("Cadastro Exercicio Lp2");
	numb=new JLabel("Numero");
	comple=new JLabel("Complemento");
	bair=new JLabel("Bairro");
	cid=new JLabel("Cidade");
	cp=new JLabel("CEP");
	dt_nasc=new JLabel("Data de Nascimento");
	rg=new JLabel("RG");
	cpf=new JLabel("CPF");

	//Campo de Texto

	Numero=new JTextField();
	Complemento=new JTextField();
	Bairro=new JTextField();
	Cidade=new JTextField();
	Cep=new JTextField();
	city=new JComboBox();
	//city=newJTextField();
	Data_nascimento=new JTextField();

	//Adiciona cidades ao ComboBox

	city.addItem("Vitoria da Conquista");
	city.addItem("Itapetinga");
	city.addItem("Barra Do Choça");
	city.addItem("Brumado");
	city.addItem("Poçoes");

	getContentPane().add(cadas);
	getContentPane().add(consul);
	getContentPane().add(Nome);
	getContentPane().add(Endereco);
	getContentPane().add(Telefone);
	getContentPane().add(Telefone2);
	getContentPane().add(Telefone3);
	getContentPane().add(nome);
	getContentPane().add(tele);
	getContentPane().add(tele1);
	getContentPane().add(tele2);
	getContentPane().add(endere);
	getContentPane().add(Cpf);
	getContentPane().add(Rg);
	getContentPane().add(email);
	getContentPane().add(Numero);
	getContentPane().add(numb);
	getContentPane().add(comple);
	getContentPane().add(Complemento);
	getContentPane().add(bair);
	getContentPane().add(Bairro);
	getContentPane().add(Cep);
	getContentPane().add(cp);
	getContentPane().add(Cidade);
	getContentPane().add(cid);
	getContentPane().add(city);
	getContentPane().add(dt_nasc);
	getContentPane().add(rg);
	getContentPane().add(cpf);

	Nome.setBounds(60,60,430,20);
	Endereco.setBounds(60,90,160,20);
	//Telefone.setBounds(60,120,300,20);
	nome.setBounds(0,60,120,20);
	endere.setBounds(0,90,120,20);
	//tele.setBounds(0,120,120,20);
	Cadastro_de.setBounds(120,20,200,20);
	Nome.setBounds(60,60,430,60);
	Endereco.setBounds(60,90,160,20);
	//Telefone.setBounds(60,120,300,20);
	nome.setBounds(0,60,120,20);
	endere.setBounds(0,90,120,20);
	//tele.setBounds(0,120,120,20);
	Cadastro_de.setBounds(120,20,200,20);
	cid.setBounds(0,15,60,20);
	city.setBounds(60,150,120,20);
	//dt_nasc.setBounds(0,180,120,20);
	//data_nascimento.setBounds(120,180,100,200);
	tele.setBounds(0,210,120,20);
	tele1.setBounds(140,210,120,20);
	tele2.setBounds(270,210,120,20);
	Telefone.setBounds(60,210,70,20);
	Telefone2.setBounds(200,210,70,20);
	Telefone3.setBounds(290,210,70,20);
	rg.setBounds(0,180,120,20);
	Rg.setBounds(20,180,100,20);
	Cpf.setBounds(145,180,100,20);
	dt_nasc.setBounds(250,180,120,20);
	Data_nascimento.setBounds(370,180,120,20);
	cadas.setBounds(90,250,120,20);
	consul.setBounds(220,250,120,20);

	Cadastro_de.setForeground(Color.RED);
	nome.setForeground(Color.RED);
	endere.setForeground(Color.RED);
	tele.setForeground(Color.RED);
	
	cadas.addActionListener(this);
	consul.addActionListener(this);
	Nome.addActionListener(this);
	Telefone.addActionListener(this);
	Telefone2.addActionListener(this);
	Telefone3.addActionListener(this);
	Cpf.addActionListener(this);
	Rg.addActionListener(this);
	Email.addActionListener(this);
        city.addActionListener(this);
	Complemento.addActionListener(this);
	Bairro.addActionListener(this);
	Numero.addActionListener(this);
	}

	//Public Static Void Main

	public static void main(String args[]){
	Cadastro obj=new Cadastro();
	obj.setVisible(true);
	}

	public void actionPerformed(ActionEvent acao){
	if(acao.getSource()==cadas){
	Pessoa p =new Pessoa();
	p.setNome(Nome.getText());
	p.setEndereco(Endereco.getText());
	p.setNumero(Numero.getText());
	p.setTelefone(Telefone.getText());
	p.setTelefone2(Telefone2.getText());
	p.setTelefone3(Telefone3.getText());
	p.setEmail(Email.getText());
	p.setRg(Rg.getText());
	p.setCpf(Cpf.getText());
	p.setBairro(Bairro.getText());
	p.setComplemento(Complemento.getText());

	if(contador==0){
	pa[0]=p;
	contador++;
	}
	else{
	pa[contador]=p;
	contador++;
	}
	}

	if(acao.getSource()==consul){
	for(int i=0;i<contador;i++){
	JOptionPane.showMessageDialog(null,"-------------------------------------"+"+\nNome:" +pa[i].getNome()
	+"\nEndereco:" +pa[i].getEndereco()
	+"\nNumero:" +pa[i].getNumero()
	+"\nBairro:" +pa[i].getBairro()
	+"\nTelefone Residencial:" +pa[i].getTelefone2()
	+"\nTelefone Comercial:" +pa[i].getTelefone()
	+"\nTelefone Celular:" +pa[i].getTelefone3());
	}}}

	protected class Pessoa{
            private String
                    nome,endereco,telefone,telefone2,telefone3,rg,cpf,email,
                    cidade,bairro,numero,complemento,cep;
            Pessoa(){
                nome=endereco=telefone=telefone2=telefone3=bairro=cidade=
                        rg=cpf=email=numero=complemento=cep="";
            }
            Pessoa(String complemento, String nome,String endereco,String telefone,
                    String telefone2,String telefone3, String bairro,
                    String cidade, String rg, String cpf, String email, String numero){
            
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
        this.telefone2=telefone2;
        this.telefone3=telefone3;
        this.rg=rg;
        this.cpf=cpf;
        this.email=email;
        this.bairro=bairro;
        this.cidade=cidade;
        this.numero=numero;
        this.complemento=complemento;
        this.cep=cep;
            }
   public void setNome(String nome){
	this.nome=nome;
	}
	public String getNome(){
	return nome;
	}
	public void setEndereco(String Endereco1){
	this.endereco=endereco;
	}
	public String getEndereco(){
	return endereco;
	}
	public void setTelefone(String Telefone){
	this.telefone=telefone;
	}
	public String getTelefone(){
	return telefone;
	}
	public void setTelefone2(String Telefone2){
	this.telefone2=telefone2;
	}
	public String getTelefone2(){
	return telefone2;
	}
	public void setTelefone3(String Telefone3){
	this.telefone3=telefone3;
	}
	public String getTelefone3(){
	return telefone3;
	}
        public void setEmail(String Email){
            this.email=email;
        }
        public String getEmail(){
            return email;
        }
        public void setRg(String rg){
            this.rg=rg;
        }
        public String getRg(){
            return rg;
        }
        public void setCpf(String cpf){
            this.cpf=cpf;
        }
        public String getCpf(){
            return cpf;
        }
        public void setCidade(String cidade){
            this.cidade=cidade;
        }
        public String getCidade(){
            return cidade;
        }
        public void setBairro(String bairro){
            this.bairro=bairro;
        }
        public String getBairro(){
            return bairro;
        }    
 	public void setComplemento(String complemento){
	this.complemento=complemento;
	}
	public String getComplemento(){
	return complemento;
	}
	public void setNumero(String numero){
	this.numero=numero;
	}
	public String getNumero(){
	return numero;
	}
	public void setCp(String cp){
	this.cep = cep;
	}
	public String getCp(){
	return cep;
	}}}
