<<<<<<< HEAD
# **Agenda Dendê**

O projeto agenda Dendê se trata de um de aplicativo de marcação e gerenciamento de consultas voltado para a área da saúde, em resumo é um recurso que facilita o agendamento de consultas médicas operado principalmente pelos agentes de saúde, tornando a tarefa de agendar consultas muito mais simples, dinâmica e menos burocrática, tanto para os operadores, quanto para a população. Este projeto está sendo desenvolvido em virtude de avaliação na disciplina de Linguagem de programação II, sendo orientado pela professora Ana Cristina, do curso Bacharelado em Sistema de Informações.


## Minimundo e Fluxo de uso

### Motivação

Diversas cidades em todo o Brasil, trabalham incessantemente para prestar o melhor serviço de marcação de consultas, entretanto é notório que grande parte do processo é realizado por meio físico gerando diversos problemas como a dificuldade de organizar as informações do paciente, além da lentidão do processo uma vez que as informações são gravadas em papel e passadas por diversas pessoas tornado o processo devagar e exageradamente burocrático, tendo isto nossa equipe propôs a produção de um meio de atualizar e automatizar grande parte dos procedimentos desde o cadastro dos cidadãos, atualização dos dados dos pacientes, marcação/agendamento de consultas e até a comunicação com os cidadãos atendidos.


### Problemas Identificados:

1. Metodologias Manuais: Um dos grandes empecilhos identificados se trata da documentação impressa, ocasionado lentidão na coleta e análise de dados, além de ser uma pratica propensa a erros.

2. Gargalos na Organização: O uso de métodos manuais dificulta a organização eficiente das informações dos pacientes, resultando em atrasos no agendamento, sobreposição de consultas e dificuldades na localização de registros.

3. Falta de Comunicação Eficiente: A comunicação entre a central e os pacientes atendidos é limitada e muitas vezes ineficaz, resultando em dificuldades na confirmação de consultas, lembretes e informações sobre procedimentos.


### Objetivos da Automatização:
A automatização e a atualização do sistema central de marcação de consultas se provam necessária uma que os princípios da automatização incluem:

1. Eficiência Operacional: Implementar um sistema automatizado para simplificar e agilizar os processos de cadastro de cidadãos, atualização de dados dos pacientes e marcação/agendamento de consultas.

2. Organização e Gestão de Dados: Garantir uma gestão eficaz das informações dos pacientes, permitindo um acesso rápido e preciso aos registros, evitando sobreposições de consultas e melhorando a eficiência geral da central.

3. Comunicação Aprimorada: Estabelecer canais de comunicação mais eficazes entre a central e os pacientes, permitindo a confirmação de consultas, envio de lembretes, notificações sobre resultados de exames e outras informações relevantes de forma oportuna e conveniente.


### Das Funcionalidades

O sistema deverá:

1. Gerenciar pacientes: adicionar pacientes ainda não cadastrados no sistema, e alterar uma eventual mudança nos dados do paciente.
2. Gerenciar agentes públicos: (função especifica do gerente ou administrador) cadastrar novos agentes no sistema confiando-lhes um login e senha, e removendo o acesso de eventuais operários desligados do serviço.
3. Gerenciar clinicas e médicos: cadastrar novas clinicas e médicos ainda não registrados no sistema, além de registrar status da clinicas cadastra e retirar do sistema, na ocasião do posto encerrar suas atividades, e quanto aos médicos alterar clinicas onde operam se houver mudança ou retirar da lista em caso de desligamento ou aposentadoria da função.
4. Solicitar marcação de consultas: criar um formulário de solicitação de consulta com base nos dados coletados do paciente, medico e clínica.
5. Confirmar agendamento de consulta: com a solicitação e uma análise nos horários da clinica e plantão do médico solicitado, haverá a confirmação do agendamento de consulta, sem conflito de data e horário entre pacientes ou médicos.
6. Relatório de consultas: (função especifica do gerente ou administrador) com base nos dados das consultas marcadas, o aplicativo deverá emitir um relatório com gráfico informativo ao administrador do aplicativo.

### Dos Menus:

#### Menus (Normal)

**Login**

1. Usuário
2. Senha
3. Login

![Captura de tela 2024-08-15 163556](https://github.com/user-attachments/assets/c0f0edbd-a541-4035-af5a-a78ee4df308e)

**Menu Inicial**

1. Pacientes
2. Consultas
3. Botão Logout
   
![Captura de tela 2024-08-15 163732](https://github.com/user-attachments/assets/71f99d2a-0f10-4dda-a0bd-3c1b9a9fe661)

**Menu Gerenciar Pacientes**

1. Consultar paciente
2. Cadastrar paciente
3. Atualizar dados dos pacientes
4. Agendar a consulta do paciente
   
![Captura de tela 2024-08-15 163915](https://github.com/user-attachments/assets/8d712933-e029-4ecb-a260-d7f60ae1d6fb)

**Menu Cadastrar Pacientes**

1. Campos para adicionar os dados dos pacientes
2. Botão confirmar
3. Botão cancelar

![Captura de tela 2024-08-15 163940](https://github.com/user-attachments/assets/8990cdb3-1d16-409d-abd2-9a58a439abfd)

**Menu Editar Pacientes**

1. Campos para alterar os dados dos pacientes
2. Botão confirmar
3. Botão cancelar

![Captura de tela 2024-08-15 171625](https://github.com/user-attachments/assets/4bca5989-04f7-40a7-9b6e-b6ebd385212d)

**Menu Gerenciar Solicitação**

1. Buscar Solicitação

![Captura de tela 2024-08-15 164012](https://github.com/user-attachments/assets/04ed85f5-46d7-44d1-84e9-5ab26f310201)

**Menu Solicitar Agendamento**

1. Campos para adicionar os dados do médico
2. Campo de buscar especialidades
3. Campo de buscar de data para consulta
4. Botão confirmar
5. Botão cancelar

![Captura de tela 2024-08-15 164116](https://github.com/user-attachments/assets/c479aa50-221b-440a-9b57-a7563de8c851)

#### Menus (Admin: +2 telas e +2 opções no menu inicial)

**Menu Inicial**

1. Pacientes
2. Consultas
3. Relatorio
4. Gerenciar usuários
5. Cadastrar

![Captura de tela 2024-08-15 164247](https://github.com/user-attachments/assets/88c79b62-2299-48b0-afb9-73211d0e05dc)

**Relatórios(Admin)**
1. Selecionar tipo de gráfico
2. Botão gerar ggrafico

![Captura de tela 2024-08-15 171658](https://github.com/user-attachments/assets/183565aa-75de-43d3-835d-123bc58733ef)

**Gerenciar usuários**

1. Adicionar
2. Editar
3. Buscar
4. Excluir

![Captura de tela 2024-08-15 171852](https://github.com/user-attachments/assets/31502bc4-306c-46a1-b50e-a08dbd02a3c0)

**Menu Cadastrar Usuários**

1. Campos para adicionar os dados do usuário
2. Botão salvar

![Captura de tela 2024-08-15 171913](https://github.com/user-attachments/assets/d45d16b3-bcd9-4c5b-ab7b-bf188f1508f3)

**Menu Editar Usuários**

1. Campos para alterar os dados do usuário
2. Botão Salvar
3. Botão cancelar

![Captura de tela 2024-08-15 171938](https://github.com/user-attachments/assets/216f9809-05c9-435d-ae25-0ebbc12f9308)

**Menu Cadastro**

1. Campo de busca de clínicas
2. Campo de busca de médicos
3. Adicionar clínica
4. Editar dados da Clínica
5. Desativar clínica da lista
6. Adicionar Médico
7. Editar dados do médico
8. excluir dados do médico da lista

![Captura de tela 2024-08-15 172022](https://github.com/user-attachments/assets/0974b73a-25de-406c-aa79-9373202dcf4c)

**Menu Cadastrar Clínica**

1. Campos para adicionar os dados da clínica
2. Botão salvar
3. Botão cancelar

![Captura de tela 2024-08-15 172104](https://github.com/user-attachments/assets/d5ea8f46-b9df-41cb-9611-26a3d83ab07b)

**Menu Editar Clínica**

1. Campos para altrar os dados da clínica
2. Botão salvar
3. Botão cancelar

![Captura de tela 2024-08-15 185150](https://github.com/user-attachments/assets/318e192f-a2fb-4b60-b6ae-7af5a63549ff)

**Menu Cadastrar Médico**

1. Campos para adicionar os dados do médico
2. Botão salvar
3. Botão cancelar

![Captura de tela 2024-08-15 172129](https://github.com/user-attachments/assets/c6e90072-b14a-4622-8475-26a2adcd1b48)

**Menu Editar Médico**

1. Campos para altrar os dados da médico
2. Botão salvar
3. Botão cancelar

![Captura de tela 2024-08-15 175436](https://github.com/user-attachments/assets/d2c9f790-0971-4c8b-a144-ab3d6f5ef32c)

### Diagrama de Classes
```mermaid
---
    title: Modelo de Diagrama de Classes
---
classDiagram
    class Person {
        <<Abstract>> 
        -String name
        -String CPF
        -String RG
        -String phoneNumber1
        -String phoneNumber2
        -LocalDate dateOfBirth
        -LocalDate createdAt
        -String address
        -String email
    }

    Person <|-- PublicAgent
    Patient --> PublicAgent
    class PublicAgent {
        -String user
        -String password
        -String typeUser
    }

    Person <|-- Patient
    class Patient {
        -String SIGTAP
    }

    Person <|-- Doctor
    Doctor --> Clinic
    class Doctor {
        int idDoctor
        string CRM
        string specialty
    }
    
    Solicitation --> Patient
    class Solicitation {
        -String nameOfRequestDoctor
        -String CRM
        -String request
        -String specialtyProblem
    }
    
    class Clinic {
        int idClinic
        string nameOfClinic
        string address
        string CNPJ
    }

    PublicAgent --> Query
    Solicitation --> Query
    Doctor --> Query
    class Query {
        -LocalDate consultationDate
        -Date dateAndTimeConsultation
    }
```
### Diagrama de Banco de Dados
```mermaid
---
    title: Modelo de Banco de Dados
---
erDiagram 

    PUBLICAGENT ||--o{ QUERY : "registra"
    PUBLICAGENT {
        int idPublicAgent
        string name
        string CPF
        string RG
        string phoneNumber1
        string phoneNumber2
        LocalDate dateOfBirth
        LocalDate createdAt
        string address
        string email
        string userr
        string password
        string typeUser
        string status
    }
    
    PATIENT ||--o{ SOLICITATION : "possui"
    PATIENT {
        int idPatient
        string name
        string CPF
        string RG
        string phoneNumber1
        string phoneNumber2
        LocalDate dateOfBirth
        LocalDate created_at
        string address
        string email
        string SIGTAP
    }
    SOLICITATION ||--|| QUERY: "referencia"
    SOLICITATION {
        int idSolicitation
        string CRM
        string request
        string nameOfRequestDoctor
        int idPatient
    }
    
    DOCTOR ||--o{ CLINIC : "pertence"
    DOCTOR ||--o{ QUERY: "ok"
    DOCTOR {
        int idDoctor
        string name
        string CPF
        string RG
        string phoneNumber1
        string phoneNumber2
        LocalDate dateOfBirth
        LocalDate createdAt
        string address
        string email
        string CRM
        string specialty
        string status
        int idClinic
    }
    
    CLINIC {
        int idClinic
        string nameOfClinic
        string officeAddress
        string status
    }

    QUERY {
        int idQuery
        LocalDateTime dateAndTimeConsultation
    }
``````
=======
# AgendaDende_oxeMarqueiv2
>>>>>>> 1f349ee5f4e30c0df9f140e5a1593085123696bd
