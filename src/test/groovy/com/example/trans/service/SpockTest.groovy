package com.example.trans.service

import com.example.trans.repository.ChildRepository
import com.example.trans.repository.ParentRepository
import com.example.trans.repository.entity.Parent
import spock.lang.Specification


class SpockTest extends Specification{


    def "셈플 테스트"() {

        given:
        def parentRepository = Mock(ParentRepository)


        def childRepository = Mock(ChildRepository)

        def secondService = Mock(SecondService)

        FamilyService familyService = new FamilyService(parentRepository, childRepository, secondService)

        parentRepository.findById(_) >> Optional.ofNullable(new Parent())


//        given:

        when:
        familyService.addChild("", 0L)

        then:
            1 == 1


    }

    def "셈플 2 given - when - then"() {
        when:
        def size = new Polygon(4).numOfSides

        then:
        size == 4
    }

}
