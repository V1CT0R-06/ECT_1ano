library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Mux2_1 is
    port (
        A      : in  STD_LOGIC;  -- Entrada 0
        B      : in  STD_LOGIC;  -- Entrada 1
        Sel    : in  STD_LOGIC;  -- Sinal de seleção
        Y      : out STD_LOGIC   -- Saída do multiplexador
    );
end Mux2_1;

architecture Process_Based of Mux2_1 is
begin
    process (A, B, Sel)
    begin
        if Sel = '0' then
            Y <= A;
        else
            Y <= B;
        end if;
    end process;
end Process_Based;
