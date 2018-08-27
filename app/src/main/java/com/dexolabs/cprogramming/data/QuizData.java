package com.dexolabs.cprogramming.data;

import com.dexolabs.cprogramming.model.Question;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class QuizData {

    public static LinkedHashMap<String, ArrayList<Question>> getQuizData() {
        LinkedHashMap<String, ArrayList<Question>> options;
        ArrayList<Question> questionList = new ArrayList<>();
        options = new LinkedHashMap<>();

        questionList.add(getQuestion(1, "Which of the following is not a valid variable name declaration?", "int _a4;", "int 4_a;", "int _4a", "int a_4;", 2, "Variable name cannot start with a digit."));
        questionList.add(getQuestion(2, "Which of the following statements should be used to obtain a remainder after dividing 4.15 by 3.1 ?", "rem = modf(4.15, 3.1);", "rem = fmod(4.15, 3.1);", "Remainder cannot be obtain in floating point division.", "rem = modf(4.15, 3.1);", 2, "fmod(x,y) - Calculates x modulo y, the remainder of x/y. \n" +
                "This function is the same as the modulus operator. But fmod() performs floating point divisions.\n#include <stdio.h>\n" +
                "#include <math.h>\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "  printf (\"fmod of 3.14/2.1 is %lf\\n\", fmod (3.14,2.1) );\n" +
                "  return 0;\n" +
                "}"));


        questionList.add(getQuestion(3, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(4, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(5, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(6, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(7, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(8, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(9, "", "", "", "", "" + "", 0, ""));
        questionList.add(getQuestion(10, "", "", "", "", "" + "", 0, ""));
        options.put("Variable Names – 1", questionList);


//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(11, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(12, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(13, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(14, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(15, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(16, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(17, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(18, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(19, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(20, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(21, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(22, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(23, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(24, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(25, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(26, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(27, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(28, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(29, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(30, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(31, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(32, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(33, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(34, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(35, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(36, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(37, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(38, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(39, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(40, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(41, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(42, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(43, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(44, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(45, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(46, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(47, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(48, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(49, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(50, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(51, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(52, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(53, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(54, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(55, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(56, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(57, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(58, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(59, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(60, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(61, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(62, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(63, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(64, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(65, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(66, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(67, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(68, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(69, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(70, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(71, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(72, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(73, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(74, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(75, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(76, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(77, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(78, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(79, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(80, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(81, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(82, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(83, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(84, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(85, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(86, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(87, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(88, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(89, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(90, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(91, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(92, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(93, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(94, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(95, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(96, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(97, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(98, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(99, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(100, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(101, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(102, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(103, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(104, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(105, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(106, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(107, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(108, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(109, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(110, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(111, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(112, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(113, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(114, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(115, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(116, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(117, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(118, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(119, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(120, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(121, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(122, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(123, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(124, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(125, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(126, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(127, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(128, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(129, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(130, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(131, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(132, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(133, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(134, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(135, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(136, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(137, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(138, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(139, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(140, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(141, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(142, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(143, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(144, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(145, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(146, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(147, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(148, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(149, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(150, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(151, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(152, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(153, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(154, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(155, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(156, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(157, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(158, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(159, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(160, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(161, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(162, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(163, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(164, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(165, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(166, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(167, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(168, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(169, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(170, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(171, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(172, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(173, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(174, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(175, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(176, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(177, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(178, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(179, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(180, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(181, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(182, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(183, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(184, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(185, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(186, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(187, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(188, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(189, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(190, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(191, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(192, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(193, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(194, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(195, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(196, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(197, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(198, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(199, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(200, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(201, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(202, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(203, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(204, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(205, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(206, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(207, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(208, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(209, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(210, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(211, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(212, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(213, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(214, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(215, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(216, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(217, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(218, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(219, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(220, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(221, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(222, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(223, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(224, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(225, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(226, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(227, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(228, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(229, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(230, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(231, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(232, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(233, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(234, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(235, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(236, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(237, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(238, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(239, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(240, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(241, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(242, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(243, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(244, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(245, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(246, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(247, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(248, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(249, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(250, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(251, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(252, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(253, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(254, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(255, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(256, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(257, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(258, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(259, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(260, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(261, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(262, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(263, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(264, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(265, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(266, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(267, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(268, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(269, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(270, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(271, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(272, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(273, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(274, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(275, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(276, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(277, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(278, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(279, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(280, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(281, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(282, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(283, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(284, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(285, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(286, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(287, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(288, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(289, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(290, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(291, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(292, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(293, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(294, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(295, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(296, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(297, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(298, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(299, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(300, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(301, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(302, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(303, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(304, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(305, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(306, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(307, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(308, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(309, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(310, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(311, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(312, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(313, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(314, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(315, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(316, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(317, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(318, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(319, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(320, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(321, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(322, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(323, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(324, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(325, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(326, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(327, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(328, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(329, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(330, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(331, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(332, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(333, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(334, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(335, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(336, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(337, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(338, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(339, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(340, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(341, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(342, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(343, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(344, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(345, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(346, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(347, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(348, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(349, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(350, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(351, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(352, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(353, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(354, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(355, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(356, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(357, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(358, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(359, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(360, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(361, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(362, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(363, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(364, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(365, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(366, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(367, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(368, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(369, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(370, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(371, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(372, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(373, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(374, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(375, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(376, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(377, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(378, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(379, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(380, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(381, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(382, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(383, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(384, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(385, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(386, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(387, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(388, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(389, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(390, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(391, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(392, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(393, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(394, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(395, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(396, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(397, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(398, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(399, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(400, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(401, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(402, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(403, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(404, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(405, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(406, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(407, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(408, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(409, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(410, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(411, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(412, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(413, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(414, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(415, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(416, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(417, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(418, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(419, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(420, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(421, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(422, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(423, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(424, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(425, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(426, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(427, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(428, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(429, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(430, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(431, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(432, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(433, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(434, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(435, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(436, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(437, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(438, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(439, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(440, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(441, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(442, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(443, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(444, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(445, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(446, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(447, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(448, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(449, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(450, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(451, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(452, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(453, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(454, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(455, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(456, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(457, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(458, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(459, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(460, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(461, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(462, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(463, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(464, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(465, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(466, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(467, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(468, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(469, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(470, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(471, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(472, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(473, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(474, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(475, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(476, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(477, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(478, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(479, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(480, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(481, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(482, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(483, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(484, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(485, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(486, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(487, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(488, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(489, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(490, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);
//
//
//        questionList = new ArrayList<>();
//        questionList.add(getQuestion(491, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(492, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(493, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(494, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(495, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(496, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(497, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(498, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(499, "", "", "", "", "" + "", 0, ""));
//        questionList.add(getQuestion(500, "", "", "", "", "" + "", 0, ""));
//        options.put("", questionList);


        return options;
    }

    private  static Question getQuestion(int questionId, String question, String option1, String option2, String option3, String option4, int answer, String explanation) {
        return new Question(questionId, question, option1, option2, option3, option4, answer, explanation, 0);
    }
}
