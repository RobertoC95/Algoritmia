//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //mudar de private para protected nas super classes(abstractas)

        /*

        enchatments:



        items para venda:
            potion of healing
            potion of regeneration
            potion of strength
            potion of weakness

            totem of undying

            water bucket


hp-=(getCurrentHP - (npc.getDano * ((100-armor)/100))
         */

        if (itemHeroi instanceof ConsumivelCombate) {

            int desperdicio = (getCurrentHP() + ((ConsumivelCombate) itemHeroi).getVidaCurar()) - (getMaxHP() + ((ConsumivelCombate) itemHeroi).getAumentoHP());
            if (desperdicio > 0) {


                System.out.println("*** " + desperdicio + " Hp wasted ***");
                Thread.sleep(500);
                System.out.println();
                System.out.println("*** Are you sure? ***");
                System.out.println();
                System.out.println("1 - No");
                System.out.println("2 - Yes");
                int sure = input.nextInt();


                switch (sure) {
                    case 1:
                        sairLoja = true;
                        break;
                    case 2:

                        setCurrentHP(getCurrentHP() + ((ConsumivelCombate) itemHeroi).getVidaCurar());
                        setMaxHP(getMaxHP() + ((ConsumivelCombate) itemHeroi).getAumentoHP());
                        setDano(getForca() + ((ConsumivelCombate) itemHeroi).getAtaqueInstantaneo());
                        npc.setCurrentHP(npc.getCurrentHP() - ((ConsumivelCombate) itemHeroi).getAtaqueInstantaneo());

                        System.out.println();
                        npc.exibirDetalhes();
                        if (getCurrentHP() > getMaxHP()) {
                            setCurrentHP(getMaxHP());
                        }
                        cloneItem = itemHeroi;
                        consumivelUsado = true;
                        sairLoja = true;
                        System.out.println();
                        System.out.println();
                        this.exibirDetalhes();

                }
            } else {
                setCurrentHP(getCurrentHP() + ((ConsumivelCombate) itemHeroi).getVidaCurar());
                setMaxHP(getMaxHP() + ((ConsumivelCombate) itemHeroi).getAumentoHP());
                setDano(getForca() + ((ConsumivelCombate) itemHeroi).getAtaqueInstantaneo());
                npc.setCurrentHP(npc.getCurrentHP() - ((ConsumivelCombate) itemHeroi).getAtaqueInstantaneo());
                System.out.println();
                npc.exibirDetalhes();

                if (getCurrentHP() > getMaxHP()) {
                    setCurrentHP(getMaxHP());
                }
                cloneItem = itemHeroi;
                consumivelUsado = true;
                sairLoja = true;
                System.out.println();
                System.out.println();
                exibirDetalhes();
                System.out.println();
                System.out.println();
            }
        }
    }
}
            }
                    } while (!sairLoja);
itemUsado(cloneItem);
        System.out.println();
        System.out.println();
exibirDetalhes();
    }
}

