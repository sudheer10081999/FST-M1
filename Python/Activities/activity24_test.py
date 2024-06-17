import pytest

# Define a fixture for the wallet amount
@pytest.fixture
def wallet_amount():
    amount = 0
    return amount

# Set up the paremeterized test method
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet_amount, earned, spent, expected):
print("Initial Wallet Amount:",wallet_amount)

    # Add money to your wallet
    wallet_amount += earned
print("Wallet Amount after earning:",wallet_amount)


# Subtract amount from wallet
    wallet_amount -= spent
print("Wallet Amount after Spending:",wallet_amount)


# Assertion
    assert wallet_amount == expected