package com.aws.lambda.mysql.data;

public class RequestDetails 
{
   private String id;
   private String Nome;
   
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}

   //cria o banco primeiro, dblambda;
	//use dblambda
	//criou a tabela colaboradores (id varchar (10), nome varchar (10));

   
   
}
