#include <stdio.h>
#include <stdlib.h>

typedef int tdado;

typedef struct no{
	tdado dado;
	struct no *ant,*prox;
}tno;

typedef struct{
	tno *head,*tail;
	int qtd;
}tlista;

//----------------------------------------

void inicializa(tlista *l){
	l->head=NULL;
	l->tail=NULL;
	l->qtd=0;
}

//----------------------------------------

int insertHead(tlista *l,tdado d){
	tno *novo;
	novo = malloc(sizeof(tno));
	novo->dado= d;
	novo->ant=NULL;
	novo->prox=l->head;
	if(l->tail==NULL) // a lista esta vazia, primeiro elemento
	   l->tail=novo;
	else
	   l->head->ant=novo;
	l->head=novo;   
	l->qtd++;
	return 1;      
}

//----------------------------------------

int insertTail(tlista *l, tdado d){
	tno *novo;
	novo = malloc(sizeof(tno));
	novo->prox=NULL;
	novo->ant=l->tail;
	novo->dado= d;
	if(l->qtd==0) // l->head==NULL
	  l->head=novo;
	else
	   l->tail->prox=novo;
	l->tail=novo;
	l->qtd++;
	return 1;   
}

//-----------------------------------------

int insereOrdenado(tlista *lista, tdado d){
	tno *novo, *aux;
	if(lista->head == NULL){
		return insertHead(lista,d);
	}
	if(d <= lista->head->dado){
		return insertHead(lista,d);
	}
	if(d >= lista->tail->dado){
		return insertTail(lista,d);
	}
	novo = malloc(sizeof(tno));
	novo->dado = d;
	aux = lista->head;
	while(aux->prox != NULL){
		if(d >= aux->dado && d<= aux->prox->dado){
			novo->ant = aux;
			novo->prox = aux->prox;
			novo->prox->ant = novo;
			aux->prox = novo;
			lista->qtd++;
			return 1;
		}
		aux = aux->prox;
	}
}

//-----------------------------------------

tdado removeHead(tlista *l){
	tno *aux; tdado removido;
	aux=l->head;
	removido=aux->dado;
	l->head=l->head->prox;
	if(l->head==NULL)
	  l->tail=NULL;
	  else
	   l->head->ant=NULL;
	free(aux);
	l->qtd--;
	return removido;     
}

//-----------------------------------------

tdado removeTail(tlista *l){
	tno *aux; tdado removido;
	aux=l->tail;
	removido = aux->dado;
	l->tail = l->tail->ant;  
	if(l->tail==NULL)
	   l->head=NULL;
	   else
	    l->tail->prox=NULL;
	free(aux);
	l->qtd--;
	return removido;    
}// fim 

//------------------------------

tdado removeLista(tlista *l, tdado v){
	tno *aux; 
	tdado retorno;
	if(l->head!=NULL){
		if(v == l->head->dado)
		   return removeHead(l);
		if(v==l->tail->dado)
		   return removeTail(l);
		aux=l->head;
		while(aux!=NULL){
			if(v == aux->dado){
				retorno = aux->dado;
				aux->prox->ant = aux->ant;
				aux->ant->prox = aux->prox;
				free(aux);
				return retorno;
			}// fim if
			aux=aux->prox;
		}// fim while      
	}
}// fim remove

//-----------------------------

void printList(tlista l){
	while(l.head!=NULL){
		printf(" %d ->", l.head->dado);
		l.head=l.head->prox;
	}// fim while
	printf("\n");
}

//-----------------------------------------

int isEmpty(tlista *l){
	  if(l->head==NULL)
	     return 1;
	  else
	  	return 0;   
}

//--------------------------------------------

int menu(){
int op;
printf("\t\t*** IFSULDEMINAS - MACHADO ***\n\n");
printf("\t\t*** Estrutura de Dados I ***\n\n");
printf("\t\t*** LISTA DUPLAMENTE ENCADEADA ***\n");
printf("1-Inserir ordenado\n");
printf("2-Insert Head\n");
printf("3-Insert Tail\n");
printf("4-Remove Head\n");
printf("5-Remove Tail\n");
printf("6- Remove\n");
printf("0-Sair\n");
scanf("%d",&op);
return op;
}

int main(){
	int op;
	tdado v;
	tlista l;
	inicializa(&l);
	do{
       printList(l);
		op=menu();
		switch(op){
			case 1: printf("Entre com um valor:");
			        scanf("%d",&v);
			        insereOrdenado(&l,v);
			break;
		    case 2: printf("Entre com um valor:");
			        scanf("%d",&v);
			        insertHead(&l,v);
			break; 
			case 3: printf("Entre com um valor:");
			        scanf("%d",&v);
			        insertTail(&l,v);
			        
			break;
			case 6:  if(!isEmpty(&l)){
				    printf("Entre com um valor para remover:");
			        scanf("%d",&v);
			        // testar se existe
				    printf("Valor %d removido\n", removeLista(&l,v));
			        }
			break;           
			case 0: printf("Saindo ...\n");
			break;
			default: printf("Opcao invalida\n");
		}// fim switch
		getch();
		system("cls");
	}while(op!=0);
}//fim main

