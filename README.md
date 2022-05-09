# Git_manipulations
## Репозиторий посвященный работе с Git командами.
### Подключение репозитория к проекту
- git init - команда генерации проекта
- git remote add origin СКОПИРОВАННЫЙ_SSH_РЕПОЗИТОРИЯ
- git remote -v - комнда проверки адреса.
### Работа с ветками
- git branch - команда для просмотра списка всех веток с указанием текущей
- git status - команда для проверки изменений файлов в текущей ветке
- git branch ИМЯ_ВЕТКИ - команда для создания новой ветки
- git checkout ИМЯ_ВЕТКИ - команда переключения текущей ветки
- git push origin --delete ИМЯ_ВЕТКИ - удаление ветки
### Работа с коммитами
- Создание коммита
  - Добавление файлов
    - git add ПУТЬ\НАЗВАНИЕ_ФАЙЛА_С_РАСШИРЕНИЕМ - добавление одного конкретного файла
    - git add . - добавление всех измененных файлов
    - git add *.РАСШИРЕНИЕ_ФАЙЛА - добавление всех изменненнных файлов с одним расширением
  - git commit -m "СООБЩЕНИЕ_КОММИТА"
  - git push origin НАЗВАНИЕ_ВЕТКИ
- Изменение последнего коммита
  - добавление измененных файлов в режиме amend
  - git push --force
- Удаление
  - git reset --hard ИМЯ_КОММИТА_ПОСЛЕ_КОТОРОГО_ВСЕ_УДАЛИТСЯ
  - git push --force
___