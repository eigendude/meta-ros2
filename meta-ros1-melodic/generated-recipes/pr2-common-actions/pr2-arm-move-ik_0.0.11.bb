# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Move the pr2 arm using inverse kinematics"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Wim Meeusen"
HOMEPAGE = "http://ros.org/wiki/pr2_arm_move_ik"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "pr2_arm_move_ik"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    roscpp \
    tf \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    roscpp \
    tf \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    roscpp \
    tf \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_arm_move_ik/0.0.11-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_arm_move_ik"
SRC_URI = "git://github.com/pr2-gbp/pr2_common_actions-release;${ROS_BRANCH};protocol=https"
SRCREV = "bb6d7de628a9f922f584b2fc7b7eca13975e20bb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
