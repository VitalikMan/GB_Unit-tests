
---
## Домашнее задание 5

---
### Задание 1:
> Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям 
добавлять, редактировать и удалять контакты.
>
> Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого 
приложения. \
Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

**_Тесты на уровне модуля (Юнит-тесты):_**
````java
/* Проверяет функциональность добавления контакта в записную книжку.*/
testAddContact() {
    // code...
}
````
````java
/* Проверяет функциональность редактирования контакта в записной книжке.*/
testEditContact() {
    // code...
}
````
````java
/* Проверяет функциональность удаления контакта из записной книжки.*/
testDeleteContact() {
    // code...
}
````
````java
/* Проверяет функциональность получения всех контактов из записной книжки.*/
testGetAllContacts() {
    // code...
}
````
````java
/* Проверяет функциональность получения контакта по идентификатору из записной книжки.*/
testGetContactById() {
    // code...
}
````
````java
/* Проверяет функциональность поиска контактов по имени или другим параметрам в записной книжке.*/
testSearchContacts() {
    // code...
}
````
---
**_Тесты на уровне системы (интеграционные тесты):_**
````java
/* Проверяет, что добавление контакта через пользовательский интерфейс взаимодействует корректно с соответствующим 
модулем записной книжки.*/
testAddContactIntegration() {
    // code...
}
````
````java
/* Проверяет, что редактирование контакта через пользовательский интерфейс взаимодействует корректно с 
соответствующим модулем записной книжки.*/
testEditContactIntegration() {
    // code...
}
````
````java
/* Проверяет, что удаление контакта через пользовательский интерфейс взаимодействует корректно с соответствующим 
модулем записной книжки.*/
testDeleteContactIntegration() {
    // code...
} 
````
````java
/* Проверяет, что получение всех контактов через пользовательский интерфейс взаимодействует корректно с 
соответствующим модулем записной книжки.*/
testGetAllContactsIntegration() {
    // code...
}
````
````java
/* Проверяет, что получение контакта по идентификатору через пользовательский интерфейс взаимодействует корректно 
с соответствующим модулем записной книжки.*/
testGetContactByIdIntegration() {
    // code...
}
````
````java
/* Проверяет, что поиск контактов по имени или другим параметрам через пользовательский интерфейс взаимодействует 
корректно с соответствующим модулем записной книжки.*/
testSearchContactsIntegration() {
    // code...
}
````
---
**_Сквозные тесты:_**
````java
/* Проверяет, что добавление, редактирование и удаление контакта через пользовательский интерфейс работает корректно 
и взаимодействует правильно с модулем записной книжки.*/
testAddEditDeleteContactFlow() {
    // code...
}
````
````java
/* Проверяет, что поиск контактов по имени или другим параметрам через пользовательский интерфейс работает 
корректно и взаимодействует правильно с модулем записной книжки.*/
testSearchContactFlow() {
    // code...
}
````
````java
/* Проверяет, что получение всех контактов через пользовательский интерфейс работает корректно и взаимодействует 
правильно с модулем записной книжки.*/
testGetAllContactsFlow() {
    // code...
}
````
---
### Задание 2:
> Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, 
почему вы так решили.
>
> Ниже список тестовых сценариев: 
> 1) Проверка того, что функция addContact корректно добавляет новый контакт в список контактов;
> 2) Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается 
в списке контактов;
> 3) Проверка полного цикла работы с контактом: от создания контакта, его редактирование и последующее удаление.

**Ответ:**
1) **Проверка того, что функция addContact корректно добавляет новый контакт в список контактов:**
   - Тип: Юнит-тест
   - Объяснение: \
   Этот тест проверяет отдельную функцию addContact, без взаимодействия с другими компонентами системы. 
   Он является изолированным и должен быть легко воспроизводимым.


2) **Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается 
в списке контактов:**
   - Тип: Интеграционный тест
   - Объяснение: \
   Этот тест проверяет взаимодействие между компонентами системы, в данном случае между пользовательским интерфейсом и 
   списком контактов. Он проверяет, что данные правильно передаются и отображаются между компонентами системы.


3) **Проверка полного цикла работы с контактом: от создания контакта, его редактирование и последующее удаление:**
   - Тип: Сквозной тест
   - Объяснение: \
   Сквозные тесты, также известные как энд-ту-энд (end-to-end) тесты, проверяют полное функционирование системы.
   Этот тест проверяет весь путь выполнения функциональности, включая несколько шагов и взаимодействий между различными 
   компонентами системы. Он помогает выявить возможные проблемы или ошибки, которые могут возникнуть в процессе работы 
   с контактами от создания до удаления.
---