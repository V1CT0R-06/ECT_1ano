import pytest
from teste1 import fibonacci

def test_inferior_1():
    print("Testa comportamento com n < 1")
    assert fibonacci(-1) == []
    assert fibonacci(0) == [0]
    assert None == [0]
