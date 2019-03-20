import unittest
from main import add

class BasicTest(unittest.TestCase):

    def test_add_number(self):
        self.assertEqual(add(2, 2), 4)

    def test_add_string(self):
        self.assertEqual(add('Hello', 'World'), 'HelloWorld')


if __name__ == '__main__':
    unittest.main()