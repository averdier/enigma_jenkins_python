# enigma_jenkins_python
Enigma | Jenkins | Python | Test d'intégration continue

Requirements :
- [Jenkins Python 3](https://github.com/averdier/enigma_jenkins_python3)

Build image
```
docker build -t enigma/test_python3 .
```

Test
```
docker run --rm enigma/test_python3 python test.py
```